const board = document.getElementById('board');
const message = document.getElementById('message');
const resetButton = document.getElementById('reset');
let currentPlayer = 'X';
let gameOver = false;
let isBotTurn = false;

function createCell(row, col) {
    const cell = document.createElement('div');
    cell.classList.add('cell');
    cell.dataset.row = row;
    cell.dataset.col = col;
    cell.addEventListener('click', handleCellClick);
    return cell;
}

function initializeBoard() {
    for (let row = 0; row < 3; row++) {
        for (let col = 0; col < 3; col++) {
            const cell = createCell(row, col);
            board.appendChild(cell);
        }
    }
}

function checkWin(player) {
    const cells = document.querySelectorAll('.cell');
    const winningCombos = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8], // sorok
        [0, 3, 6], [1, 4, 7], [2, 5, 8], // oszlopok
        [0, 4, 8], [2, 4, 6] // átlók
    ];

    for (const combo of winningCombos) {
        const [a, b, c] = combo;
        if (cells[a].innerText === player && cells[b].innerText === player && cells[c].innerText === player) {
            return true;
        }
    }
    return false;
}

function checkDraw() {
    const cells = document.querySelectorAll('.cell');
    return Array.from(cells).every(cell => cell.innerText !== '');
}

function handleCellClick(e) {
    const cell = e.target;
    if (!cell.innerText && !gameOver && !isBotTurn && currentPlayer === 'X') {
        cell.innerText = currentPlayer;
        if (checkWin(currentPlayer)) {
            message.innerText = `Játékos ${currentPlayer} nyert!`;
            gameOver = true;
        } else if (checkDraw()) {
            message.innerText = 'Döntetlen!';
            gameOver = true;
        } else {
            currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
            message.innerText = `Következő játékos: ${currentPlayer}`;
            if (currentPlayer === 'O' && !gameOver) {
                isBotTurn = true;
                makeBotMove();
            }
        }
    }
}

function makeBotMove() {
    const cells = document.querySelectorAll('.cell');
    const availableCells = [...cells].filter(cell => !cell.innerText);
    if (availableCells.length > 0) {
        const randomIndex = Math.floor(Math.random() * availableCells.length);
        const randomCell = availableCells[randomIndex];
        setTimeout(() => {
            randomCell.innerText = 'O';
            if (checkWin('O')) {
                message.innerText = 'A számítógép nyert!';
                gameOver = true;
            } else if (checkDraw()) {
                message.innerText = 'Döntetlen!';
                gameOver = true;
            } else {
                currentPlayer = 'X';
                message.innerText = `Következő játékos: ${currentPlayer}`;
                isBotTurn = false;
            }
        }, 1000); // Várunk egy másodpercet a bot lépése után
    }
}

function resetGame() {
    const cells = document.querySelectorAll('.cell');
    cells.forEach(cell => {
        cell.innerText = '';
    });
    currentPlayer = 'X';
    message.innerText = '';
    gameOver = false;
    isBotTurn = false;
}

initializeBoard();
resetButton.addEventListener('click', resetGame);
