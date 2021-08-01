
package br.com.prmarinho.service.store.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.prmarinho.service.store.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Endereco_QNAME = new QName("http://resource.webservice.correios.com.br/", "endereco");
    private final static QName _BuscaEventosLista_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosLista");
    private final static QName _Evento_QNAME = new QName("http://resource.webservice.correios.com.br/", "evento");
    private final static QName _BuscaEventosResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosResponse");
    private final static QName _Rastro_QNAME = new QName("http://resource.webservice.correios.com.br/", "rastro");
    private final static QName _Objeto_QNAME = new QName("http://resource.webservice.correios.com.br/", "objeto");
    private final static QName _BuscaEventos_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventos");
    private final static QName _BuscaEventosListaResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosListaResponse");
    private final static QName _Destino_QNAME = new QName("http://resource.webservice.correios.com.br/", "destino");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.prmarinho.service.store.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaEventosLista }
     * 
     */
    public BuscaEventosLista createBuscaEventosLista() {
        return new BuscaEventosLista();
    }

    /**
     * Create an instance of {@link Eventos }
     * 
     */
    public Eventos createEventos() {
        return new Eventos();
    }

    /**
     * Create an instance of {@link EnderecoMobile }
     * 
     */
    public EnderecoMobile createEnderecoMobile() {
        return new EnderecoMobile();
    }

    /**
     * Create an instance of {@link Sroxml }
     * 
     */
    public Sroxml createSroxml() {
        return new Sroxml();
    }

    /**
     * Create an instance of {@link Objeto }
     * 
     */
    public Objeto createObjeto() {
        return new Objeto();
    }

    /**
     * Create an instance of {@link BuscaEventos }
     * 
     */
    public BuscaEventos createBuscaEventos() {
        return new BuscaEventos();
    }

    /**
     * Create an instance of {@link BuscaEventosListaResponse }
     * 
     */
    public BuscaEventosListaResponse createBuscaEventosListaResponse() {
        return new BuscaEventosListaResponse();
    }

    /**
     * Create an instance of {@link Destinos }
     * 
     */
    public Destinos createDestinos() {
        return new Destinos();
    }

    /**
     * Create an instance of {@link BuscaEventosResponse }
     * 
     */
    public BuscaEventosResponse createBuscaEventosResponse() {
        return new BuscaEventosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "endereco")
    public JAXBElement<EnderecoMobile> createEndereco(EnderecoMobile value) {
        return new JAXBElement<EnderecoMobile>(_Endereco_QNAME, EnderecoMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosLista")
    public JAXBElement<BuscaEventosLista> createBuscaEventosLista(BuscaEventosLista value) {
        return new JAXBElement<BuscaEventosLista>(_BuscaEventosLista_QNAME, BuscaEventosLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "evento")
    public JAXBElement<Eventos> createEvento(Eventos value) {
        return new JAXBElement<Eventos>(_Evento_QNAME, Eventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosResponse")
    public JAXBElement<BuscaEventosResponse> createBuscaEventosResponse(BuscaEventosResponse value) {
        return new JAXBElement<BuscaEventosResponse>(_BuscaEventosResponse_QNAME, BuscaEventosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sroxml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "rastro")
    public JAXBElement<Sroxml> createRastro(Sroxml value) {
        return new JAXBElement<Sroxml>(_Rastro_QNAME, Sroxml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Objeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "objeto")
    public JAXBElement<Objeto> createObjeto(Objeto value) {
        return new JAXBElement<Objeto>(_Objeto_QNAME, Objeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventos")
    public JAXBElement<BuscaEventos> createBuscaEventos(BuscaEventos value) {
        return new JAXBElement<BuscaEventos>(_BuscaEventos_QNAME, BuscaEventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosListaResponse")
    public JAXBElement<BuscaEventosListaResponse> createBuscaEventosListaResponse(BuscaEventosListaResponse value) {
        return new JAXBElement<BuscaEventosListaResponse>(_BuscaEventosListaResponse_QNAME, BuscaEventosListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destinos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "destino")
    public JAXBElement<Destinos> createDestino(Destinos value) {
        return new JAXBElement<Destinos>(_Destino_QNAME, Destinos.class, null, value);
    }

}
