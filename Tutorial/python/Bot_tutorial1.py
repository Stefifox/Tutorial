import time
import telepot

Token = telepot.Bot("")

def message(msg):
    content_type, chat_type, chat_id = telepot.glance(msg)

    if(msg['text'] == "/start"):
        Token.sendMessage(chat_id, "Messaggio di start", parse_mode = "HTML")
    if(msg['text'] == "/photo"):
        Token.sendPhoto(chat_id, open("img.jpg", "rb"), "Didascalia")
    if(msg['text'] == "/doc"):
        Token.sendDocument(chat_id, open("doc.txt", "rb"), "Didascalia")

    if(msg['text'] == "/send"):
        replyText = msg['reply_to_message']['text']
        replyUser = msg['reply_to_message']['from']['username']
        Token.sendMessage(chat_id, replyText + " \nFrom User: @"+replyUser)

Token.message_loop(message)

while 1:
    time.sleep(2)
