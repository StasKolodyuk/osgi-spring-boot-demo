FROM mkroli/karaf:4.2
COPY target/deploy /deploy
EXPOSE 9015
ENTRYPOINT /opt/karaf/bin/karaf server
