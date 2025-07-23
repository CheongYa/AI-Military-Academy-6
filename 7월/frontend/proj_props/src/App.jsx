import './App.css'
import Button from './Button'
import InfoCard from './InfoCard'


function Hello(props) {
  return <h1>Hello {props.user}</h1>
}

const cardData1 = {
  title: "Props in React",
  content: "Props pass data from one component to another.",
  author: "Alice"
};
const cardData2 = {
  title: "React Composition",
  content: "Composition makes your components more reusable"
};


function App() {

  const buttonProps = {
    text: "메일",
    color: "red",
    a: 1,
    b: 2,
    c: 3
  }
  
  return (
    <>
      <Hello user = 'AI School' />

      <Button {...buttonProps} />
      <Button text = {"메일"} color={"red"} />
      <Button text = {"카페"} color={"green"} />
      <Button text = {"블로그"} color={"blue"} />

      <InfoCard {...cardData1} />
      <InfoCard {...cardData2} />
    </>
  )
}

export default App
