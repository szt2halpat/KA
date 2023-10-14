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
