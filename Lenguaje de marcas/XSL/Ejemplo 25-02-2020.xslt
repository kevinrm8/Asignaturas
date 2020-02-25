<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
    <h2>My CD Collection</h2>
    <table border="1">
      <tr bgcolor="#9acd32">
        <th>Title</th>
        <th>Artist</th>
      </tr>
      <xsl:for-each select="catalog/cd"> <!-- Asi muestra todos-->
      <!-- <xsl:for-each select="catalog/cd[artist='Bob Dylan']">  ASI MUESTRA SOLO BOB DYLAN
            <xsl:for-each select="catalog/cd[price<'10'] PRECIOS MENORES QUE 10"> 
            <xsl:for-each select="catalog/cd[year&lt;1985]"> AÑO MENOR QUE 1985
            <xsl:for-each select="catalog/cd[company!='Columbia']"> 
            <xsl:if test="price>10"> PARA PONER IF -->
      <tr>
        <td><xsl:value-of select="title"/></td>
        <td><xsl:value-of select="artist"/></td>
      </tr>
          <!-- </xsl: if>  PARA CERRAR EL IF -->
    </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>

