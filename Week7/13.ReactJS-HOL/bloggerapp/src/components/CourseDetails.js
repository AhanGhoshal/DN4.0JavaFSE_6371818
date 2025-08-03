function CourseDetails() {
  const courses = [
    { name: "Angular", date: "4/5/2021" },
    { name: "React", date: "6/3/20201" },
  ];

  return (
    <div className="section" style={{lineHeight: '1.5'}}>
      <h1>Course Details</h1>
      {courses.length > 0 && courses.map((course, index) => (
        <div key={index}>
          <h1 style={{marginTop: '4px'}}>{course.name}</h1>
          <p><strong>{course.date}</strong></p>
          
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
