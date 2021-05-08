import Footer from "component/Footer";
import NavBar from "component/NavBar";
import DataTable from "component/DataTable";
import BarChart from "component/BarChart";
import DonutChart from "component/DonutChart";

function App() {
  return (
    <>

      <NavBar />
      <div className="container" >
        <h1 className="text-primary py-3">Daschboard Vendas!</h1>

        <div className="row px-3 ">
          <div className="col-sm-6">
          <h5 className = "text-center text-secondary">Taxa de Vendas (%)</h5>
            <BarChart />
          </div>

          <div className="col-sm-6">
            <h5 className = "text-center text-secondary">Taxa de Vendas (%)</h5>
            <DonutChart />
          </div>

        </div>

          <div className = "text-primary">
            <h2>Todas Vendas</h2>
          </div>
        <DataTable />
      </div>

      <Footer />
    </>
  );
}

export default App;
