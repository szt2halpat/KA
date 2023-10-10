function getRandomOrder(nev) {
    let tomb = [];
    while (nev.length > 0) {
        const randomIndex = Math.floor(Math.random() * nev.length);
        const removedElement = nev.splice(randomIndex, 1)[0];
        tomb.push(removedElement);
    }
    return tomb;
}

const napok = ["hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"];

const randomsorrend = getRandomOrder(napok);
console.log(randomsorrend);


const szamok = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const randomszamok = getRandomOrder(szamok);
console.log(randomszamok);
