import React from 'react';

const BlogDetails = ({ blogs }) => {
  const blogList = blogs.map((blog) => (
    <div key={blog.id}>
      <h4>{blog.title}</h4>
      <p>By: {blog.author}</p>
    </div>
  ));

  return (
    <div>
      <h2>Blog Details</h2>
      {blogList}
    </div>
  );
};

export default BlogDetails;