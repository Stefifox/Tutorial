import random
import telepot

Token = telepot.Bot("Inserisci il token qui")

def message(msg):
    content_type, chat_type, chat_id = telepot.glance(msg)

    if(msg['text'] == "/start"):
        Token.sendMessage(chat_id, "Messaggio di start", parse_mode = "HTML")

Token.message_loop(message)

while 1:
    time.sleep(2)
