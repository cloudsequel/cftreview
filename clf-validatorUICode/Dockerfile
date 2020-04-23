FROM node:12
ENV INSTALL_PATH /my_dockerized_app
RUN mkdir -p $INSTALL_PATH
WORKDIR $INSTALL_PATH
COPY package.json .
RUN npm install
RUN npm install -g @angular/cli@9.0.4
COPY . /$INSTALL_PATH
RUN npm run build:prod
COPY . .

FROM nginx:stable-alpine
COPY --from=build-stage /$INSTALL_PATH/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf
WORKDIR /usr/share/nginx/html
# Permission
RUN chown root /usr/share/nginx/html/*
RUN chmod 755 /usr/share/nginx/html/*





#LABEL version="1.0"
#RUN mkdir hack
#RUN rm /usr/share/nginx/html/*

#WORKDIR /usr/share/nginx/html/
#COPY . .

#RUN chown -R nginx:nginx /usr/share/nginx/html/* && chmod -R 777 /usr/share/nginx/html/*