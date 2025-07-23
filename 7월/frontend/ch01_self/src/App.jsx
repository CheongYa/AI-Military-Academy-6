import './App.css'
import Headers from './component/Header'
import Main from './component/Main'
import Footer from './component/Footer'

const name = "sesac"

function App() {

  return (
    <>
      <Headers />
      <Main />
      <Footer />
      <p>
        {/* JSX 주석 */}
        {name}
      </p>
      <h1>JSX</h1>
      <br />
    </>
  )
}

export default App
