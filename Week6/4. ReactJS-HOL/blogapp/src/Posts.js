import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        }
    }
    loadPosts() {
            fetch("https://jsonplaceholder.typicode.com/posts")
                .then((response) => {
                    if (!response.ok) throw new Error("Failed to fetch posts");
                    return response.json();
                })
                .then((data) => {
                    const postList = data.map(
                        (item) => new Post(item.userId, item.id, item.title, item.body)
                    );
                    this.setState({ posts: postList });
                })
                .catch((error) => {
                    this.setState({ hasError: true });
                    console.error("Error loading posts:", error);
                });
    }
    componentDidMount() {
        this.loadPosts();
    }
    render() {
        const { posts, hasError } = this.state;

        if (hasError) {
            return <p>Error occurred while loading posts.</p>;
        }

        return (
            <div>
                <h2>Posts</h2>
                {posts.map((post) => (
                    <div key={post.userId} style={{ marginBottom: "20px" }}>
                        <h5>{post.id}</h5>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
    componentDidCatch(error, info) {
        alert("Oops,Something went wrong: " + error.toString());
        console.error("Error caught in component:", error, info);
    }
}

export default Posts;
