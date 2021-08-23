var fs = require('fs');
spath = './a.js';
dpath = './copya.js';
try {
    if (fs.existsSync(dpath)) {
        var data = fs.readFileSync('a.js', 'utf8');
        console.log(data);
        fs.appendFile('copya.js', data, (err) => {
            if (err)
                console.log(err);
            else 
            console.log('successfully written');
        })
    }else{
        console.log("File not found");
    }
}
catch (error) {
    console.log(err);
}
