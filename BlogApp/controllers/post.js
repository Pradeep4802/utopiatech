const Blog = require("../models/postCont");

exports.createPost = async (req, res) => {
    try {
        const { title, body } = req.body;
        const response = await Blog.create({ title, body });
        res.send(200).json({
            success: true,
            data: response,
            message: 'Post created Successfully'
        })
    } catch (err) {
        console.error(err);
        console.log(err);
        res.status(500).json({
            success: false,
            data: "internal server error",
            message: err.message,
        })
    }
}