import './App.css';

function App() {
  const element = "Office Space";
  const sr = 'https://cdn.prod.website-files.com/65af543d642e0bb78eea2cf5/66324e486200c36002784fe2_1702348628_en-idei-club-p-best-office-pictures-dizain-krasivo-64.jpg';
  const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' };

  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }

  const jsxatt = <img src={sr} width="50%" height="25%" alt="Office Space" />;

  return (
    <><div className="App">
      <h1>{element}, at Affordable Range</h1>
    </div><div className="header">
        {jsxatt}
        <h1>Name: {ItemName.Name}</h1>
        <h3 className={colors.join(' ')}>Rent: Rs. {ItemName.Rent}</h3>
        <h3>Address: {ItemName.Address}</h3>
      </div></>
  );
}

export default App;
