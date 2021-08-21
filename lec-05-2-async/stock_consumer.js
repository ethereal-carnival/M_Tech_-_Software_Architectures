const amqp = require('amqplib/callback_api')
amqp.connect('amqp://localhost', (err, con) => {
    con.createChannel((e, channel) => {
        const queueName = 'queue_stock'
        channel.assertQueue(queueName, {durable: true})

        channel.consume(queueName, (msg) => {
            console.log("***Received " + msg.content.toString())
        }, {noAck: true})
    })
})