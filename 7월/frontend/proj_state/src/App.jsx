import './App.css'
import { useState } from 'react'

function App() {
  // 초기값을 0:0, 함수 2개 요소의 배열을 반환
  // 0 - 초기값, 함수 - 상태 변화 함수
  // useState() : 콘솔 - undefined, 함수 2개 요소의 배열을 반환
  
  /*
  const [count, setCount] = useState(0)

  console.log(count)

  return (
    <>
      <h1>Count: {count}</h1>
        <button onClick={() => setCount(count + 1)}>
          +
        </button>

        <button onClick={() => setCount(count - 1)}>
          -
        </button>
    </>
  ) */

  const [isPinned, setPinned] = useState(false)

  const togglePinned = () => {
    setPinned(!isPinned)
  }

  return (
    <>
      <button onClick={togglePinned}>
        {isPinned && '📌'} Pinn This!
      </button>
    </>
  )
}

export default App
