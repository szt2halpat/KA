function toltes() {
  let adatok = document.querySelectorAll(".adatok");
  for (let i = 0; i < adatok.length; i++) {
    let random = generaltSzoveg();
    adatok[i].innerHTML = random;
  }
}

function generaltSzoveg() {
  let szovegek = [
    "Matematika",
    "Történelem",
    "Testnevelés",
    "Foci",
    "Magyar nyelvtan",
    "Angol",
    "Német",
    "Szoft. fej.",
    "Programozás",
    "Magyar irodalom",
    "Olasz",
  ];
  let randomIndex = Math.floor(Math.random() * szovegek.length);
  return szovegek[randomIndex];
}

let darkmode = false;

function Szinvaltas() {
  let container = document.querySelector("table");
  let background = document.body;

  darkmode = !darkmode;

  if (darkmode) {
    container.classList.add("dark-mode");
    background.classList.add("dark-mode");
  } else {
    container.classList.remove("dark-mode");
    background.classList.remove("dark-mode");
  }

  localStorage.setItem("dark", darkmode);
}

document.addEventListener("DOMContentLoaded", function () {
  const savedDarkMode = localStorage.getItem("dark");
  darkMode = savedDarkMode === "true";

  if (darkMode) {
    Szinvaltas();
  }
});
