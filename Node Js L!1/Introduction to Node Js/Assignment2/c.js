// i. Synchronous mode

var fs = require('fs');
try
{
var data = fs.readFileSync('a.js','utf8');
console.log(data);
 
}
catch(e)
{
console.log('Error:',e.stack);
}



// ii. Asynchronous mode

var fs = require('fs')

fs.readFile('b.js', 'utf8',function(error, data)
{
if(error)
{
console.log('error:-' +error);
throw error;
}
console.log(data);
});
