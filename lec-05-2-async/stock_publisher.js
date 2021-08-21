const amqp = require('amqplib/callback_api')
amqp.connect('amqp://localhost', (err, con) => {
    con.createChannel((e, channel) => {
        const queueName = 'queue_stock'
        channel.assertQueue(queueName, {durable: true})
        setInterval(function()
        {
            let currentSensex = Math.random() * 60000
            let message = `Current value of SENSEX: ${currentSensex}`
            channel.sendToQueue(queueName, Buffer.from(message))
            console.log(message)
        }, 1000)
    })
})

