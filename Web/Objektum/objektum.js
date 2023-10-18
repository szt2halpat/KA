window.onload = (event) => {
  megjelenites();
};

//1. rész

const user = { firstname: "John", lastname: "Smith" };

//Módosítás
console.log("Első név módosítása");

user.firstname = "Paul";

console.log(user.firstname);

//Törlés

console.log("Törlés után");

delete user.firstname;

console.log(user);

//2. rész
// isEmpty függvény

const teszt = {};

function isEmpty(Object) {
  if (Object.keys().length == 0) {
    return true;
  } else {
    return false;
  }
}

const isObjectEmpty = (objectName) => {
  return (
    objectName &&
    Object.keys(objectName).length === 0 &&
    objectName.constructor === Object
  );
};

console.log(isObjectEmpty(user));

//3. rész

const fizetes = {
  Anna: 2100,
  Cecil: 1890,
  Emil: 2050,
  Gerald: 2920,
};

let osszeg = 0;

for (let nev in fizetes) {
  osszeg += fizetes[nev];
}

const fiz = document.getElementById("fizetes");

fiz.innerText = "Ennyit kerestek: " + osszeg + " Ft";

console.log(osszeg);

//4. rész

const heroes = [
  { firstName: "Ahsoka", lastName: "Tano", job: "padawan" },
  { firstName: "Boba", lastName: "Fett", job: "fejvadász" },
  { firstName: "Han", lastName: "Solo", job: "csempész" },
  { firstName: "Leia", lastName: "Organa", job: "szenátor" },
  { firstName: "Teszt", lastName: "Teszt", job: "Teszt" },
];

const tag = document.getElementById("negyedik");

let content = ``;

function megjelenites() {
  heroes.forEach((element) => {
    tag.innerHTML += `<div id="container"><div class="card">${element.firstName}</div> <div class="card">${element.lastName}</div> <div class="card">${element.job}</div></div>`;
  });
}
