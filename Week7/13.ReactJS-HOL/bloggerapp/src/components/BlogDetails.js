function BlogDetails() {
  const blogs = [
    {
      title: "React Learning",
      author: "Stephen Biz",
      description: "Welcome to learning React!"
    },
    {
      title: "Installation",
      author: "Schewzdenier",
      description: "You can install React from npm."
    },
  ];

  return (
    <div className="section" style={{lineHeight: '1.5'}}>
      <h1>Blog Details</h1>
      {blogs.map((blog, i) => (
        <div key={i}>
          <h1>{blog.title}</h1>
          <p style={{marginBottom: '4px'}}><b>{blog.author}</b></p>
          <p>{blog.description}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
