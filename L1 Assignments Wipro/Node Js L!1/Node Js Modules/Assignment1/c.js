const net = require('net');
// Connect to a server @ port 9898
const client = net.createConnection({ port: 3000 }, () => {
  console.log('connected to the server.');
  client.write(' Hello Server');
});
client.on('data', (data) => {
  console.log(data.toString());
//   client.end();
});
client.on('end', () => {
  console.log('CLIENT: I disconnected from the server.');
});