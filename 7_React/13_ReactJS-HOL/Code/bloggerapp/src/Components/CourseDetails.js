import React from 'react';

const CourseDetails = ({ courses }) => {
  const courseList = courses.map((course) => (
    <div key={course.id}>
      <h4>{course.name}</h4>
      <p>Date: {course.date}</p>
    </div>
  ));

  return (
    <div>
      <h2>Course Details</h2>
      {courseList}
    </div>
  );
};

export default CourseDetails;