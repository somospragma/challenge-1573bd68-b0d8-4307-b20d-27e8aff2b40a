# Implementación de Flujos Reactivos en un Sistema de Procesamiento de Pagos

En un sistema de procesamiento de pagos, los eventos de pago provienen de múltiples fuentes, como aplicaciones móviles, sitios web y terminales de punto de venta. El sistema debe manejar estos flujos de eventos de manera reactiva, asegurando resiliencia, escalabilidad y confiabilidad. Los eventos incluyen solicitudes de pago, confirmaciones, rechazos y reversiones. El sistema debe mantener la consistencia de los datos y manejar situaciones de alta carga y fallos temporales.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del Entorno de Flujos Reactivos

**Objetivo:** Establecer un entorno capaz de manejar eventos de pago de manera reactiva.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar las fuentes de eventos de pago y sus características.
- Configurar un sistema que pueda recibir y procesar estos eventos de forma asíncrona.

**Entregable:** Entorno de flujos reactivos configurado y listo para recibir eventos de pago.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo modelar los eventos de pago para que sean manejados de manera eficiente.
- Piensa en cómo asegurar que el sistema pueda escalar bajo alta carga.

</details>

### Fase 2: Manejo de Flujos de Eventos

**Objetivo:** Implementar la lógica para manejar diferentes tipos de eventos de pago.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar operadores para filtrar, transformar y combinar eventos de pago.
- Asegurar que el sistema maneje correctamente eventos como solicitudes, confirmaciones, rechazos y reversiones.

**Entregable:** Lógica implementada para manejar diferentes tipos de eventos de pago de manera reactiva.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo usar operadores para mejorar la eficiencia del procesamiento de eventos.
- Piensa en cómo asegurar que el sistema maneje correctamente los eventos en diferentes escenarios.

</details>

### Fase 3: Garantizar Resiliencia y Escalabilidad

**Objetivo:** Asegurar que el sistema maneje fallos temporales y alta carga de manera efectiva.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar mecanismos para manejar fallos temporales y recuperarse de ellos.
- Asegurar que el sistema pueda escalar bajo alta carga sin perder consistencia.

**Entregable:** Sistema reactivo que garantiza resiliencia y escalabilidad bajo condiciones de alta carga y fallos temporales.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo usar patrones de diseño reactivos para mejorar la resiliencia del sistema.
- Piensa en cómo asegurar que el sistema pueda mantener la consistencia de los datos bajo alta carga.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los flujos reactivos y cómo se aplican en el procesamiento de eventos de pago?
- **paraQueSirve**: ¿Para qué sirve usar programación reactiva en un sistema de procesamiento de pagos?
- **comoSeUsa**: ¿Cómo se usan los operadores de Project Reactor para manejar flujos de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar flujos reactivos y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica garantizar la resiliencia y escalabilidad en un sistema reactivo?

## Criterios de Evaluacion

- Configuración correcta del entorno de flujos reactivos.
- Implementación efectiva de la lógica para manejar diferentes tipos de eventos de pago.
- Garantía de resiliencia y escalabilidad del sistema bajo condiciones de alta carga y fallos temporales.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
