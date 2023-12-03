const leftContent = document.querySelector(".left-container");
const rightContent = document.querySelector(".right-container");

document.addEventListener("wheel", (event) => {
  const isMouseOverLeftContent = leftContent.contains(event.target);

  if (!isMouseOverLeftContent && event.deltaY !== 0) {
    // Ha az egér görget és nem a bal oldali tartalmon belül van,
    // akkor görgetjük a jobb oldali tartalmat
    rightContent.scrollTop += event.deltaY;
    // Megakadályozzuk az alapértelmezett görgetést a bal oldalon
    event.preventDefault();
  }
});

// Összes link lekérése a navigációban
const navLinks = document.querySelectorAll(".nav-li a");

// Függvény az aktív elem kiválasztására a Scrollspyhoz
function setActiveLink() {
  // Aktuális görgetési pozíció
  const scrollY = window.scrollY;

  // Aktív elem keresése, ami az adott pozíción van
  navLinks.forEach((link) => {
    const section = document.querySelector(link.getAttribute("href"));
    if (
      section.offsetTop <= scrollY &&
      section.offsetTop + section.offsetHeight > scrollY
    ) {
      // Az aktív linkre .active class hozzáadása
      navLinks.forEach((link) => link.classList.remove("active"));
      link.classList.add("active");
    }
  });
}

// Scroll esemény figyelése, hogy frissítse az aktív elemet
window.addEventListener("scroll", setActiveLink);

// Oldal betöltésekor is frissíti az aktív elemet
window.addEventListener("DOMContentLoaded", setActiveLink);
