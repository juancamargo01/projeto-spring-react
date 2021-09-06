import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavaBar";



function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <div className="text-primary">
          <h1> ola Mundo</h1>
          <DataTable/>


        </div>
      </div>
      <Footer/>
    </>
  );
}

export default App;
