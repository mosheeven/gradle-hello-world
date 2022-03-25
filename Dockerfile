FROM python:3.7-slim

USER root
RUN mkdir /app

COPY ./app /app

WORKDIR /app/
RUN pip install --upgrade pip
RUN pip install -r requirements.txt

CMD ["python3", "app.py"]