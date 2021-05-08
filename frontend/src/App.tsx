import Footer from "component/Footer";
import NavBar from "component/NavBar";
import DataTable from "component/DataTable";

function App() {
  return (
    <>
     
     <NavBar />
      <div className="container" >
        <h1 className="text-primary py-3">Ola Mundo!</h1>

        <DataTable />
      </div>
      
     <Footer />
    </>
  );
}

export default App;
