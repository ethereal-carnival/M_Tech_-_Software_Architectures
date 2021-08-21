// Generate a random number
// square that number
// increment that number by 1
// print it or write it to file

const pipeline = require('pipes-and-filters');
const lec05Pipeline = pipeline.create("Demo")

const randomNumberFilter = (input, next) => {
    let num = (Math.random() * input)
    console.log(`RandomNumberFilter generated ${num}`)
    if(num > 50) {
        next(null, num);
    }
    else {
        next(new Error("Number is too large"))
    }
}

const squareFilter = (input, next) => {
    let result = input * input;
    console.log(`SquareFilter generate ${result}`)
    next(null, result);
}

const incrementFilter = (input, next) => {
    let result = input + 1;
    console.log(`IncrementFilter generate ${result}`)
    next(null, result);
}

const printerSink = (input, next) => {
    console.log(`The result is ${input}`)
}

lec05Pipeline.use(randomNumberFilter)
lec05Pipeline.use(squareFilter)
lec05Pipeline.use(incrementFilter)
lec05Pipeline.use(printerSink)
console.log(lec05Pipeline)

lec05Pipeline.once('error', (err) => {
    console.error(err)
})

lec05Pipeline.execute(10, null)