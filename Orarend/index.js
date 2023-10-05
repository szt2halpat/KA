document.addEventListener("DOMContentLoaded", function () {
    const editableCells = document.querySelectorAll(".editable");
    const modifyButton = document.getElementById("modifyButton");

    modifyButton.addEventListener("click", function () {
        const hourInput = document.getElementById("hour");
        const daySelect = document.getElementById("day");
        const subjectInput = document.getElementById("subject");

        const selectedHour = parseInt(hourInput.value) - 1; // Az index 0-tól indul
        const selectedDay = daySelect.value;

        if (selectedHour >= -1 && selectedHour <= 8) {
            editableCells.forEach(cell => {
                if (cell.dataset.hour === hourInput.value && cell.dataset.day === selectedDay) {
                    cell.textContent = subjectInput.value;
                }
            });
        }

        hourInput.value = "";
        subjectInput.value = "";
    });
});
