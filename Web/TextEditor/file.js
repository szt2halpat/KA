let currentContent = "";

function selectFile() {
    document.getElementById('file').click();
}
function handleFile() {
    const fileInput = document.getElementById('file');
    const file = fileInput.files[0];
    if (file) {
        const reader = new FileReader();
        reader.onload = function (e) {
            currentContent = e.target.result;
            document.getElementById('editorTextarea').innerText = currentContent;
        };
        reader.readAsText(file);
    }
}
function saveFile() {
    const contentToSave = document.getElementById('editorTextarea').innerText;
    const blob = new Blob([contentToSave], { type: 'text/plain' });
    const a = document.createElement('a');
    a.href = URL.createObjectURL(blob);
    a.download = 'SzovegesAllomany.txt';
    a.style.display = 'none';

    document.body.appendChild(a);
    const timeout = setTimeout(() => {
        document.body.removeChild(a);
    }, 2000);

    a.addEventListener('click', function () {
        clearTimeout(timeout);
        document.body.removeChild(a);
        showMessage('A fájl sikeresen letöltve!');
    });

    a.addEventListener('error', function () {
        clearTimeout(timeout);
        document.body.removeChild(a);
        showMessage('Hiba történt a letöltés során.');
    });

    a.click();
}
function showMessage(message) {
    const messageDiv = document.createElement('div');
    messageDiv.textContent = message;
    messageDiv.style.position = 'fixed';
    messageDiv.style.bottom = '20px';
    messageDiv.style.left = '50%';
    messageDiv.style.transform = 'translateX(-50%)';
    messageDiv.style.padding = '10px';
    messageDiv.style.backgroundColor = '#333';
    messageDiv.style.color = '#fff';
    messageDiv.style.borderRadius = '5px';
    messageDiv.style.zIndex = '9999';

    document.body.appendChild(messageDiv);

    setTimeout(() => {
        document.body.removeChild(messageDiv);
    }, 5000);
}
function darkMode() {
    const Body2 = document.querySelector("body");
    const Title = document.querySelector("h1");
    const Button = document.querySelector("button");
    const Label = document.querySelector(".file-label");
    const moonIcon = document.getElementById("moon");
    const sunIcon = document.getElementById("sun");
    const editorTextarea = document.getElementById("editorTextarea");

    const computedStyle = getComputedStyle(Body2);
    const isLightMode = computedStyle.backgroundColor === "rgb(255, 255, 255)";

    if (isLightMode) {
        Body2.style.transition = "background-color 0.5s ease, color 0.5s ease";
        Title.style.transition = "color 0.5s ease";
        Button.style.transition = "background-color 0.5s ease, color 0.5s ease";
        Label.style.transition = "background-color 0.5s ease, color 0.5s ease";
        editorTextarea.style.transition = "color 0.5s ease";
        moonIcon.style.transition = "color 0.5s ease";
        sunIcon.style.transition = "color 0.5s ease";
        Body2.style.backgroundColor = "black";
        Title.style.color = "white";
        Button.style.backgroundColor = "black";
        Button.style.color = "white";
        Button.addEventListener('mouseover', function()
        {
            this.style.backgroundColor = "white";
            this.style.color = "black";
        })
        Button.addEventListener('mouseout', function()
        {
            this.style.backgroundColor = "black";
            this.style.color = "white";
        })
        Label.style.backgroundColor = "black";
        Label.style.color = "white";
        Label.addEventListener('mouseover', function()
        {
            this.style.backgroundColor = "white";
            this.style.color = "black";
        })
        Label.addEventListener('mouseout', function()
        {
            this.style.backgroundColor = "black";
            this.style.color = "white";
        })
        editorTextarea.style.color = "white";
        moonIcon.style.display = "none";
        sunIcon.style.display = "block";
        sunIcon.style.color = "orange";
    }
    else if(!isLightMode)
    {
        Body2.style.backgroundColor = "white";
        Title.style.color = "black";
        Button.style.backgroundColor = "white";
        Button.style.color = "black";
        Button.addEventListener('mouseover', function()
        {
            this.style.backgroundColor = "black";
            this.style.color = "white";
        })
        Button.addEventListener('mouseout', function()
        {
            this.style.backgroundColor = "white";
            this.style.color = "black";
        })
        Label.style.backgroundColor = "white";
        Label.style.color = "black";
        Label.addEventListener('mouseover', function()
        {
            this.style.backgroundColor = "black";
            this.style.color = "white";
        })
        Label.addEventListener('mouseout', function()
        {
            this.style.backgroundColor = "white";
            this.style.color = "black";
        })
        editorTextarea.style.color = "black";
        moonIcon.style.display = "block";
        sunIcon.style.display = "none";
    }
}

