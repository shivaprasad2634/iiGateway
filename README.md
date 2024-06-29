# iiGateway
iiGateway is a core component of the intelligence-integration microservice, designed to seamlessly integrate GPT-powered AI with various messaging platforms. Built using Spring, iiGateway serves as the entry point for all incoming requests, efficiently routing them to the appropriate services within the microservice architecture. This open-source project is licensed under the MIT License, ensuring flexibility and broad usage.  

## Key Features:

**Efficient Request Routing**: Directs traffic to the correct services, ensuring smooth and responsive interactions.  
**Scalability**: Built with scalability in mind to handle increasing loads without compromising performance.  
**Security**: Incorporates robust security measures to protect data and ensure secure communications.  
**Flexibility**: Easily configurable to adapt to various messaging platforms and use cases.  
  
  
## Ports and Apps

| **Applications**  | **Ports** |
|-------------------|-----------|
| iiGateway         | 7100 +5   |
| iiKnowledgeBase   | 7105 +5   |
| iiKnowledgeSearch | 7110 +10  |
| iiChatConnect     | 7120 +20  |
| iiGPTConnect      | 7140 +20  |
| iiOrchestrator    | 7160 +20  |
| iiNamingService   | 7200 +5   |
| iiConfigService   | 7205 +5   |



