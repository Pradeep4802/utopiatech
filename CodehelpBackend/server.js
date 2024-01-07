
// Server Instantiate
const express = require('express');
const app = express();

// Used to parse req.body in express -> PUT or POST
const bodyParser = require('body-parser');

// specifically parse JSON data & add it to the request.Body object
app.use(bodyParser.json());

// Activate the server on 3000 port
app.listen(3000, () => {
    console.log("Server started on server 3000");
})

// Routes
app.get('/', (request, response) => {
    response.send("Hello Jee , Kaise Jo sare");
})


app.post('/api/cars', (request, response) => {
    const { name, brand } = request.body;
    console.log(name);
    console.log(brand);
    response.send("Car submitted successfully");
})

const mongoose = require("mongoose");
mongoose.connect('mongodb://localhost:27017/myDatabase', {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => {
    console.log("Connection Successful");
}).catch(error => { console.log("Received an error"); });