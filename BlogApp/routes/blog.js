const express = require("express");
const router = express.Router();

// Import controller
// const { post } = require("../controllers/createPost");
const { dummy } = require("../controllers/dummyController");
const { createComment } = require("../controllers/comment");
// const { like } = require("../controller/like");

// Define API Routes
router.post("/comments/create", createComment);
router.get("/dummy",dummy);

module.exports = router;