function submitForm(event) {
    event.preventDefault();

    const form = document.getElementById('survey-form');
    const firstName = document.getElementById('first-name').value;
    const lastName = document.getElementById('last-name').value;
    const dateOfBirth = document.getElementById('date-of-birth').value;
    const country = document.getElementById('country').value;

    const genderInputs = document.querySelectorAll('input[name="gender"]');
    const selectedGenders = Array.from(genderInputs)
        .filter(input => input.checked)
        .map(input => input.value);

    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobileNumber = document.getElementById('mobile-number').value;

    if (!firstName || !lastName || !dateOfBirth || !country || selectedGenders.length === 0 || !profession || !email || !mobileNumber) {
        alert("Please fill in all the fields before submitting.");
        return;
    }

    const result = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dateOfBirth}
        Country: ${country}
        Gender: ${selectedGenders.join(', ')}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobileNumber}
    `;

    alert(result);

    form.reset();
}