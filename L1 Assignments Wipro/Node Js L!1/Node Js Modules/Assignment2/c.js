var events = require('events');
var eventEmitter = new events.EventEmitter();


var listner1 = function listner1() {
    console.log('listner1 executed.');
}

var listner2 = function listner2() {
    console.log('listner2 executed.');
}
var listner3 = function listner3() {
    console.log('listner3 executed.');
}


eventEmitter.addListener('connection', listner1);

eventEmitter.addListener('connection', listner2);

eventEmitter.addListener('connection3', listner3);

var eventListeners = require('events').EventEmitter.listenerCount
    (eventEmitter, 'connection');
console.log(eventListeners + " Listner(s) listening to connection event");
s
eventEmitter.emit('connection');
eventEmitter.emit('connection3');

eventListeners = require('events').EventEmitter.listenerCount(eventEmitter, 'connection');
console.log(eventListeners + " Listner(s) listening to connection event");
eventListeners = require('events').EventEmitter.listenerCount(eventEmitter, 'connection3');
console.log(eventListeners + " Listner(s) listening to connection3 event");
