const express = require('express');
const app = express();

require('dotenv').config();
const PORT = process.env.PORT || 5000;

// middleware to parse json request body
app.use(express.json());

const blogRoutes = require("./routes/blog");

//mount the blog API routes
app.use("/api/v1", blogRoutes);

app.listen(PORT, () => {
    console.log(`Server started successfully at ${PORT}`);
})

// connect to the database
const dbConnect = require("./config/database");
dbConnect();

//default Route
app.get("/", (req, res) => {
    res.send(`<h1> This is HOMEPAGE my baby </h1>`)
});

