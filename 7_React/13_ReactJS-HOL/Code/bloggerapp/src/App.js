import React from 'react';
import './App.css';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';
import { books, blogs, courses } from './data';

function App() {
  return (
    <div className="container">
      <div className="col col-with-border">
        <CourseDetails courses={courses} />
      </div>
      <div className="col col-with-border">
        <BookDetails books={books} />
      </div>
      <div className="col">
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;