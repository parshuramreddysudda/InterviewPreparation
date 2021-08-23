// Create a Node JS Script file that displays hostname & platform details of current system 
// on the console.(Hint : Use OS module)

var os = require('os');
console.log("Platform of OS: " + os.platform());
console.log("Hostname of OS: " + os.hostname());
