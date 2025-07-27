// src/Posts.js

import React, { Component } from 'react';
import { Post } from './Post'; // ✅ Correct import from Post.js

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const postObjects = data.map(
          (post) => new Post(post.userId, post.id, post.title, post.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch((error) => {
        console.error('Error fetching posts:', error);
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h2>Blog Posts</h2>
        {this.state.posts.length === 0 ? (
          <p>Loading posts...</p>
        ) : (
          this.state.posts.map((post) => (
            <div key={post.id} style={{
              border: '1px solid #ccc',
              padding: '10px',
              marginBottom: '10px',
              borderRadius: '5px'
            }}>
              <h3>{post.title}</h3>
              <p>{post.body}</p>
              <small>User ID: {post.userId}</small>
            </div>
          ))
        )}
      </div>
    );
  }
}

export default Posts;
