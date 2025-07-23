const Button = ({text, color, a, b, c}) => {
    return <button style={{color: color}}>
        {text}  {color} {a} {b} {c}
    </button>
}

export default Button