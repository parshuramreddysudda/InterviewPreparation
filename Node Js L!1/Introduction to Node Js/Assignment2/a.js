
var sys = require('util')
var exec = require('child_process').exec;
var child;

child = exec("pwd:", function(error, stdout, stderr){
console.log('stdout:-' +stdout);
console.log('stderr:-' +stderr);
if(error!== null)
{
console.log('exec error:' +error);
}
});
