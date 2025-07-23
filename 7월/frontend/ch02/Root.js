// Root.js
import Search from "./Search";
import Table from "./Table";

const person = {
    firstName : 'John',
    lastName : 'Johnson',
    email : 'j.johnson@gmail.com'
}

// 객체 구조 분해
const {firstName, lastName, email} = person;

console.log(firstName);
console.log(lastName);
console.log(email);

const Main = () => {
    return (
        <>
            <Search />
            <Table />
        </>
    )
}

export default Main;