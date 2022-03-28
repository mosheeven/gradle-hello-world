FROM python:3.7-slim
USER root
COPY ./app /app
WORKDIR /app/
RUN pip install --upgrade pip
RUN pip install -r requirements.txt

CMD ["python3", "app.py"]


FROM python:3.7-slim
COPY . /app
WORKDIR /app
RUN pip install --upgrade pip 
RUN pop install -r requirements.txt
EXPOSE 8080
CMD ["python3", "app.py"]

