let app = require('express')();
let fs = require('fs');

app.post('/persistence/:word', (req, res) => {
    let { word } = req.params;
    let fileName = process.cwd() + "/" + new Date().getTime() + ".txt";
    fs.writeFile(fileName, word, null, (err) => {
        res.send('Done');
    });
});

app.listen(8082, () => console.log('Persistence is running in 8082'));