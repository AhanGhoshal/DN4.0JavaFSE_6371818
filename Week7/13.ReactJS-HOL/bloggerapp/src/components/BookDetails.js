function BookDetails() {
  const books = [
    { title: "Master React", price: 670 },
    { title: "Deep Dive into Angular 11", price: 800 },
    { title: "Mongo Essentials", price: 450 },
  ];

  return (
    <div className="section" style={{lineHeight: '1.7'}}>
      <h1>Book Details</h1>
      {books.map((book, i) =>
        book.price > 0 ? (
          <div key={i} style={{ marginLeft: '50px' }}>
            <strong>{book.title}</strong>
            <p>{book.price}</p>
          </div>
        ) : null
      )}
    </div>
  );
}

export default BookDetails;
