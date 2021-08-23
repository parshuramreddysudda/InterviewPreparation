var fs = require("fs");

console.log(__filename);

if (process.argv.length <= 2) {
    console.log("Usage:", __filename, "Path/to/directory");
    var path = process.argv[2];
    fs.readdir(__dirname, (err, files) => {
        if (err)
          console.log(err);
        else {
          console.log("\nCurrent directory filenames:");
          files.forEach(file => {
            console.log(file);
          })
        }
      })
}
    ;
