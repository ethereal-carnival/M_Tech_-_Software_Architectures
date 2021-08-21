let app = require('express')();

app.get('/palindrome/:word', (req, res) => {
    let { word } = req.params;
    let reversedWord = word.split('').reverse().join('');
    res.send(word===reversedWord)
});

app.listen(8081, () => console.log('Palindrome engine is running in 8081'));