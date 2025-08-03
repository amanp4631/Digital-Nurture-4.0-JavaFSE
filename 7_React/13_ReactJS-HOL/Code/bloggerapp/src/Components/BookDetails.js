import React from 'react';

const BookDetails = ({ books }) => {
  const booklet = books.map((book) => (
    <div key={book.id}>
      <h4>{book.bname}</h4>
      <p>Price: ${book.price}</p>
    </div>
  ));

  return (
    <div>
      <h2>Book Details</h2>
      {booklet}
    </div>
  );
};

export default BookDetails;