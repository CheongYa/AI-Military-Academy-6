import './App.css'

// 자식 컴포넌트
// const Hello = () => { 방식도 같음
function Hello() {
  return (
    <button>
      Hello
    </button>
  )
}

// 부모 컴포넌트
function App() {
  

  return (
    <>
      <Hello />
      <Hello />
      <Hello />
    </>
  )
}

export default App
