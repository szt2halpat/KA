// Az elemek kiválasztása
const body = document.body;
const container = document.querySelectorAll('.container');
const modositas = document.querySelectorAll('.modositas');
const header = document.querySelectorAll('.header');
const row = document.querySelectorAll('.row');
const modeToggle = document.getElementById('mode-toggle');

// Dark mód beállítása
function enableDarkMode() {
    body.classList.add('dark-mode');
    container.forEach(element => {
        element.classList.add('dark-mode');
    });
    header.forEach(element => {
        element.classList.add('dark-mode');
    });
    row.forEach(element => {
        element.classList.add('dark-mode');
    });
    modositas.forEach(element => {
        element.classList.add('dark-mode');
    });
}

// Light mód beállítása
function enableLightMode() {
    body.classList.remove('dark-mode');
    container.forEach(element => {
        element.classList.remove('dark-mode');
    });
    header.forEach(element => {
        element.classList.remove('dark-mode');
    });
    row.forEach(element => {
        element.classList.remove('dark-mode');
    });
    modositas.forEach(element => {
        element.classList.remove('dark-mode');
    });
}

// Módváltás gomb eseménykezelője
modeToggle.addEventListener('click', () => {
    if (body.classList.contains('dark-mode')) {
        enableLightMode();
    } else {
        enableDarkMode();
    }
});

