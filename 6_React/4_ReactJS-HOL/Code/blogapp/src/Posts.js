import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
      hasError: false, // For componentDidCatch fallback UI
    };
  }

  // Lifecycle method to catch errors in child components during rendering
  static getDerivedStateFromError(error) {
    return { hasError: true };
  }

  // Lifecycle method for logging errors
  componentDidCatch(error, errorInfo) {
    console.error("Error caught in Posts component:", error, errorInfo);
    // You could also send error to an error reporting service here
  }

  // Fetches posts from the API
  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      if (!response.ok) {
        // throw new Error(HTTP error! status: ${response.status});
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      const data = await response.json();
      console.log(data);
      
    //   const fetchedPosts = data.map(
    //     (post) => new Post(post.id, post.title, post.body)
    //   );
      this.setState({ posts: data, error: null }); // Clear previous errors
    } catch (error) {
      console.error('Error fetching posts:', error);
      this.setState({ error: error, hasError: true }); // Set error and trigger fallback
    }
  };

  // Called after the component mounts
  componentDidMount() {
    this.loadPosts();
  }

  render() {
    const { posts, error, hasError } = this.state;

    // Render fallback UI if an error occurred in lifecycle or child component
    if (hasError) {
      return (
        <div style={{ padding: '20px', border: '1px solid red', color: 'red' }}>
          <h1>Oops! Something went wrong.</h1>
          <p>We're having trouble loading the posts. Please try again later.</p>
          {error && <p>Details: {error.message}</p>} {/* Show detailed error if available */}
        </div>
      );
    }

    return (
      <div style={{ fontFamily: 'Arial, sans-serif', padding: '20px' }}>
        <h1 style={{ color: '#333', textAlign: 'center' }}>Blog Posts</h1>
{/* {posts.key} */}
{/* <Post key = {post.id} post={post} /> */}
        {posts.length > 0 ? (
          posts.map((post) => (
            <div
              key={post.id}
              style={{
                marginBottom: '20px',
                border: '1px solid #ddd',
                borderRadius: '8px',
                padding: '15px',
                boxShadow: '0 2px 4px rgba(0,0,0,0.1)',
                backgroundColor: '#fff',
              }}
            >
              <h2 style={{ color: '#0056b3', marginBottom: '10px' }}>{post.title}</h2>
              <p style={{ color: '#555', lineHeight: '1.6' }}>{post.body}</p>
            </div>
          ))
        ) : (
          <p style={{ textAlign: 'center', color: '#666' }}>Loading posts...</p>
        )}
      </div>
    );
  }
}

export default Posts;